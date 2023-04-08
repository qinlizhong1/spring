package collectionProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CollectionBasicType {
    private String[] strings;
    private List<String> stringList;
    private Set<String> stringSet;
    private Map<String, String> stringMap;
    private Properties properties;
}
