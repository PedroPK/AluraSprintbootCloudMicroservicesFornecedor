package microfornecedor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microfornecedor.models.FornecedorInfo;
import microfornecedor.services.dao.FornecedorInfoRepository;

@Service
public class FornecedorInfoService {
	
	@Autowired
	private FornecedorInfoRepository repository;

	public FornecedorInfo getInfoPorEstado(String estado) {
		FornecedorInfo result = this.repository.findByEstado(estado);
		return result;
	}
	
}