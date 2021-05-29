package refleksja;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // ogracza uzycie adnotacji tylko do konkretnego elementu lub alementow
@Retention(RetentionPolicy.RUNTIME) // ustawienie poziomu widocznosci adnotacji, domyślnie source
public @interface CarNationality {

     String nationality() default "US";

}
