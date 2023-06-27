package com.example.cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Compra {

      @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
      private Long id;

      private float valorTotal;
      private int numeroProdutos;


      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public float getValorTotal() {
            return valorTotal;
      }

      public void setValorTotal(float valorTotal) {
            this.valorTotal = valorTotal;
      }

      public int getNumeroProdutos() {
            return numeroProdutos;
      }

      public void setNumeroProdutos(int numeroProdutos) {
            this.numeroProdutos = numeroProdutos;
      }

}
