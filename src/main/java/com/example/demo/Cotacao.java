package com.example.demo;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cotacao {
  private String dataHoraCotacao;
  private BigDecimal cotacaoVenda;
  private BigDecimal cotacaoCompra;
  
}
