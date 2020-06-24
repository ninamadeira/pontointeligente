package com.madeira.pontointeligente.api.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class EmpresaDto {

	private Long id;
	private String razaoSocial;
	private String cnpj;
}
