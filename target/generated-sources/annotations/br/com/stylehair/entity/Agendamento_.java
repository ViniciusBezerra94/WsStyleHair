package br.com.stylehair.entity;

import br.com.stylehair.entity.Cliente;
import br.com.stylehair.entity.Funcionario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-30T18:33:43")
@StaticMetamodel(Agendamento.class)
public class Agendamento_ { 

    public static volatile SingularAttribute<Agendamento, Cliente> cliente;
    public static volatile SingularAttribute<Agendamento, Funcionario> func;
    public static volatile SingularAttribute<Agendamento, Character> horaMarcada;
    public static volatile SingularAttribute<Agendamento, Date> dataHoraFim;
    public static volatile SingularAttribute<Agendamento, Double> valorTotal;
    public static volatile SingularAttribute<Agendamento, Date> dataHoraIni;
    public static volatile SingularAttribute<Agendamento, Long> id;

}