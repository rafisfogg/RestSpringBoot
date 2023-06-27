package com.example.cliente;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
      private Long id;

      private String nome;

      private String endereco;

      private String cpf;

      @OneToMany(targetEntity=Compra.class, fetch=FetchType.EAGER)
      @JoinColumn(name="cliente_id")
      private List<Compra> compras;

      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

      public String getEndereco() {
            return endereco;
      }

      public void setEndereco(String endereco) {
            this.endereco = endereco;
      }

      public String getCpf() {
            return cpf;
      }

      public void setCpf(String cpf) {
            this.cpf = cpf;
      }

      public List<Compra> getCompras() {
            return compras;
      }

      public void setCompras(List<Compra> compras) {
            this.compras = compras;
      }

}

