package br.com.stylehair.entity;

import br.com.stylehair.entity.Agendamento;
import br.com.stylehair.entity.Servico;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-02T22:09:01")
@StaticMetamodel(AgendamentoServico.class)
public class AgendamentoServico_ { 

    public static volatile SingularAttribute<AgendamentoServico, Long> id;
    public static volatile SingularAttribute<AgendamentoServico, Servico> servico;
    public static volatile SingularAttribute<AgendamentoServico, Agendamento> agendamento;

}