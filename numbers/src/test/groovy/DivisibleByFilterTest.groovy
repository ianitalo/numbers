import com.aor.numbers.DivisibleByFilter
import spock.lang.Specification

class DivisibleByFilterTest extends Specification
{
    private DivisibleByFilter filtro
    def 'Accept'()
    {
        given:
        Integer testnumber = 9
        Integer divisor = 2
        when:
        filtro = new DivisibleByFilter(divisor)
        def res = filtro.accept(testnumber)
        then:
        res == false

    }
}
