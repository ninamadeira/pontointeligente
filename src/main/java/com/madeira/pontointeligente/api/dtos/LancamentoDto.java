package com.madeira.pontointeligente.api.dtos;

import java.util.Optional;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class LancamentoDto {
	
	private Optional<Long> id = Optional.empty();
	@NotEmpty(message = "Data não pode ser vazia.")
	private String data;
	private String tipo;
	private String descricao;
	private String localizacao;
	private Long funcionarioId;

}
