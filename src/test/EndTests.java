package test;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import main.End;

public class EndTests {
    @Test
    public void nwslStatsTest01(){
        String s = End.junitMethod();
        String cmp = """
2023 NWSL Stats
Team Name: W/D/L
San Diego Wave: 11/4/7
Portland Thorns: 10/5/7
North Carolina Courage: 10/5/7
Seattle Reign: 9/5/8
Angel City FC: 8/7/7
Gotham FC: 8/7/7
Orlando Pride: 10/1/11
Washington Spirit: 7/9/6
Racing Louisville: 6/9/7
Houston Dash: 6/8/8
KC Current: 8/2/12
Chicago Red Stars: 7/3/12
""";
        Assertions.assertEquals(cmp,s);
    }
}
