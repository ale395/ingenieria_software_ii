package pkg_entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkg_entidad.Hijo;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-11-04T15:30:31")
@StaticMetamodel(Vacuna.class)
public class Vacuna_ { 

    public static volatile SingularAttribute<Vacuna, Hijo> idHijo;
    public static volatile SingularAttribute<Vacuna, Date> fechaAplicacion;
    public static volatile SingularAttribute<Vacuna, String> aplicada;
    public static volatile SingularAttribute<Vacuna, Integer> id;
    public static volatile SingularAttribute<Vacuna, String> nombre;

}