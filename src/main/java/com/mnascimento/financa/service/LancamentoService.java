package com.mnascimento.financa.service;

import java.util.List;

import com.mnascimento.financa.model.entity.Lancamento;
import com.mnascimento.financa.model.enums.StatusLancamento;

public interface LancamentoService {
	
	Lancamento salvar (Lancamento lancamento);
	
	Lancamento atualizar (Lancamento lancamento);
	
	void deletar (Lancamento lancamento);
	
	List<Lancamento> buscar (Lancamento lancamentoFiltro);
	
	void atualizarStatus (Lancamento lancamento, StatusLancamento status);
	
	void validar(Lancamento lancamento);

}
