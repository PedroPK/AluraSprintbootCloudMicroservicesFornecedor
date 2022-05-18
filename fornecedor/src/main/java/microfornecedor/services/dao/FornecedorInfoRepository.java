package microfornecedor.services.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import microfornecedor.models.FornecedorInfo;

@Repository
public interface FornecedorInfoRepository extends CrudRepository<FornecedorInfo, Long> {
	
	FornecedorInfo findByEstado(String estado);
	
}
