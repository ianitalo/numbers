import com.aor.numbers.PositiveFilter
import spock.lang.Specification

class PositiveFilterTest extends Specification
{
    PositiveFilter filtro = new PositiveFilter()
    def 'Accept'()
    {
        given:
        Integer testnumber = 2
        when:
        def res = filtro.accept(testnumber)
        then:
        res == true
    }
}
