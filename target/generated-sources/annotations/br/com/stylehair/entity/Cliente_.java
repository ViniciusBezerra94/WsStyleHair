package br.com.stylehair.entity;

import br.com.stylehair.entity.Agendamento;
import br.com.stylehair.entity.Telefone;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-15T16:00:41")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> senha;
    public static volatile ListAttribute<Cliente, Agendamento> agendamentos;
    public static volatile SingularAttribute<Cliente, String> cpf;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, Long> id;
    public static volatile ListAttribute<Cliente, Telefone> telefones;
    public static volatile SingularAttribute<Cliente, String> email;

}