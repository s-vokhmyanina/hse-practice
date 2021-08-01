package LibACT4E;

public class ArrayMap<K, T> implements FiniteMap<K, T> {
    private final FiniteSet<K> source;
    private final FiniteSet<T> target;
    // or final private Map<String, T> dictionary = new HashMap<String, T>();

    public ArrayMap(FiniteSet<K> source, FiniteSet<T> target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public FiniteSet<K> source() {
        return source;
    }

    @Override
    public FiniteSet<T> target() {
        return target;
    }

    @Override
    public T call(K a) {
        final int i = source.indexOf(a) % target.size();
        return target.get(i);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("source:\n\t")
                .append("elements: ").append(source.toString()).append("\n")
                .append("target:\n\t")
                .append("elements: ").append(target.toString()).append("\n")
                .append("values:");
        for (int i = 0; i < source.size(); i++) {
            final K current = source.get(i);
            final T element = target.get(i % target.size());
            builder.append("\n\t- [").append(current).append(", ").append(element).append("]");
        }
        return builder.toString();
    }

//    public static class Serializer extends JsonSerializer<ArrayMap<?>> {
//        @Override
//        public void serialize(ArrayMap<?> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
//            gen.writeStartObject("");
//        }
//    }
}
