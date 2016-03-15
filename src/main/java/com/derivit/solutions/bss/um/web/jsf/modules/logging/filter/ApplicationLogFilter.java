package com.derivit.solutions.bss.um.web.jsf.modules.logging.filter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.MDC;

import com.derivit.solutions.bss.um.dataobject.UserDO;

/**
 * The Class ApplicationLogFilter.
 * @author prabhat.jha
 */
public class ApplicationLogFilter implements Filter {

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {

	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		HttpSession session = null;
		UserDO loggedInUserDO = null;
		if (servletRequest instanceof HttpServletRequest) {
			session = ((HttpServletRequest) servletRequest).getSession();
			if (session != null && session.getAttribute("userID") != null) {
				loggedInUserDO = (UserDO) session.getAttribute("userID");
			}
		}
		MDC.put("RequestCtx",
				UUID.randomUUID() + " : " + ((loggedInUserDO != null
						? loggedInUserDO.getFirstName() + " " + loggedInUserDO.getLastName() + " ( " + loggedInUserDO.getUsername() + " )"
						: StringUtils.EMPTY)));
		try {
			filterChain.doFilter(servletRequest, servletResponse);
		} finally {
			MDC.remove("RequestCtx");
		}
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}
}