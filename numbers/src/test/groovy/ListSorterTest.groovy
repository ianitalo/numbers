import com.aor.numbers.ListSorter
import spock.lang.Specification

class ListSorterTest extends Specification
{
    private List<Integer> list,expected
    def setup()
    {
        list = Arrays.asList(3, 2, 6, 1,25, 4, 5, 7,8,9,1,2,3,8,4)
        expected = Arrays.asList(1,1,2, 2,3, 3, 4,4, 5, 6, 7,8,8,9,25)
    }
    def 'sort'()
    {
        given:
        ListSorter sorter = new ListSorter()
        when:
        List<Integer> sorted = sorter.sort(list)
        then:
        sorted == expected
    }
}
