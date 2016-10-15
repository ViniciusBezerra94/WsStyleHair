package br.com.stylehair.entity;

import br.com.stylehair.entity.Agendamento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-15T16:00:41")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, String> tipo;
    public static volatile SingularAttribute<Pagamento, Long> id;
    public static volatile SingularAttribute<Pagamento, String> status;
    public static volatile SingularAttribute<Pagamento, Agendamento> agendamento;

}