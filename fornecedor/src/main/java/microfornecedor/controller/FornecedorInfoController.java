package microfornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microfornecedor.models.FornecedorInfo;
import microfornecedor.services.FornecedorInfoService;

@RestController
@RequestMapping("/info")
public class FornecedorInfoController {
	
	@Autowired
	private FornecedorInfoService fornecedorInfoService;
	
	@RequestMapping("/{estado}")
	public FornecedorInfo getInfoPorEstado(@PathVariable String estado) {
		FornecedorInfo result = this.fornecedorInfoService.getInfoPorEstado(estado);
		return result;
	}
	
}
