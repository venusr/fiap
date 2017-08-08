package fiap.scj.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util


import fiap.scj.bean.UsuarioSessaoBean;

/**
 * Servlet Filter implementation class PopulaUsuarioFilter
 */
@WebFilter("/index.jsp")
public class PopulaUsuarioFilter implements Filter {

    /**
     * Default constructor. 
     */
    public PopulaUsuarioFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest r = (HttpServletRequest) req; 
		HttpSession session = r.getSession(true);
		UsuarioSessaoBean usuario = null;
		System.out.println("teste");
					
		UsuarioSessaoBean us1 = (UsuarioSessaoBean) session.getAttribute("usuario"); 
		usuario = new UsuarioSessaoBean();
		session.setAttribute("usuario", usuario);
		usuario.setPrimeiroAcesso(Date());
		
		
		chain.doFilter(req, resp);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
