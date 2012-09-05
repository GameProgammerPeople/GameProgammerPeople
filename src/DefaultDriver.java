import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 * User: fergsmyth
 * Date: 05/09/2012
 * Time: 20:54
 */
public class DefaultDriver {
        public static void main(String args[]){
            try{
                AppGameContainer appGameContainer = new AppGameContainer(new DefaultGame("Title"));
                appGameContainer.setDisplayMode(800,600,false);
                appGameContainer.start();
            } catch (SlickException ex){
                ex.printStackTrace();
            }
        }
}
