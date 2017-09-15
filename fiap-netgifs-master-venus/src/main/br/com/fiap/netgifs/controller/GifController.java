package br.com.fiap.netgifs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.netgifs.model.Gif;
import br.com.fiap.netgifs.model.User;
import br.com.fiap.netgifs.repository.GifRepository;
import br.com.fiap.netgifs.repository.UserRepository;
import br.com.fiap.netgifs.vo.UserData;


@Controller
public class GifController {

	@Autowired
	private GifRepository gifRepository;
	
	@RequestMapping(value = "/detalhegif", method = RequestMethod.GET)
	public ModelAndView detalheGif(User user, HttpSession session) {
		String view = "/detalhe";
		Long id = (long) 1;
		
		Gif gif = new Gif();	
		//gif.setId(id);
		gif.setDescricao("Descricao Gif1");
		gif.setFaixaEtaria("De 10 a 15 anos");
		gif.setGenero("Comédia");
		gif.setIdioma("Português");
		gif.setUrlGif("http://www.gifs.blog.br/imagens/gifs-gifs-animados-oculos-1.gif");
		gravaGifs(gif);
		
		Gif gif2 = new Gif();
		id = (long) 2;
		//gif2.setId(id);
		gif2.setDescricao("Descricao Gif2");
		gif2.setFaixaEtaria("De 10 a 15 anos");
		gif2.setGenero("Comédia");
		gif2.setIdioma("Português");
		gif2.setUrlGif("http://www.gifs.blog.br/imagens/gifs-gifs-animados-oculos-1.gif");
		gravaGifs(gif2);

		System.out.println("User login detalhesgif: " + user.getUsername());

		
		ModelAndView mv = new ModelAndView(view);
		mv.addObject("gif", gif);
		
		System.out.println("entrou no detalhegif");
		
		return mv;
	}
	
	public void gravaGifs(Gif gif) {
		    gifRepository.save(gif);

	}
	
	@RequestMapping(value = "/exibirfull", method = RequestMethod.POST)
	public ModelAndView exibirFull(Gif gif) {
		String view = "/paginafull";
		
		System.out.println("objeto pagina full: " + gif);
		System.out.println("objeto pagina full - descricao: " + gif.getDescricao());
		System.out.println("objeto pagina full - url: " + gif.getUrlGif());

		
		ModelAndView mv = new ModelAndView(view);
		mv.addObject("gif", gif);

		return mv;
	}
}
	
	
