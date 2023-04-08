package collectionProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private Integer age;
    private Book[] bookArray;
    private List<Book> bookList;
    private Set<Book> bookSet;
    private Map<String, Book> bookMap;

}
