package sortingClean;


import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

// TODO: Add java classes (in separate files for annotations and aspects)
public class MainApp {
    public static void main(String[] args) {
        WeldContainer container = new Weld().initialize();

        // TODO: Change this line to initialize an injected sortingClean.AlgorithmRunner
        AlgorithmRunner algorithmRunner = new AlgorithmRunner();

        algorithmRunner.runAlgorithms();
    }
    // TODO: Add producers
}
