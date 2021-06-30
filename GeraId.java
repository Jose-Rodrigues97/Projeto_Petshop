import java.util.UUID;

public abstract class GeraId {

    // #region GERA ID 
    public static String criaId() {
        String rand = UUID.randomUUID().toString();
        rand = rand.substring(0, 7);
        return rand;
    }
    // #endregion
}
