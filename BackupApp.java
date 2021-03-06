
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rhuan.silva
 */
public class BackupApp {
    public static void main(String[] args) throws IOException {
        Path home = Paths.get("C:/Java-estudos/Java-lsi/src/");
        String filtro = "*.java";
        DirectoryStream<Path> stream = Files.newDirectoryStream(home,filtro);
        
        for(Path p : stream){
            Path txt = home.resolve(p);
            Path backup = home.resolve(p+".back");
            Files.copy(txt, backup,StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
