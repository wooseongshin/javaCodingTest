//import java.nio.file.OpenOption;
//import java.nio.file.Path;
//import java.util.concurrent.CompletableFuture;
//import java.util.function.Function;
//
//import static java.util.Objects.requireNonNull;
//
//public interface StreamMessage<T> extends Publisher<T> {
//
//    default CompletableFuture<Void> writeTo(Function<? super T, ? extends HttpData> mapper, Path destination,
//                                            OpenOption... options) {
//        requireNonNull(mapper, "mapper");
//
//        HttpData httpData = (HttpData) map(obj -> mapper.apply(obj));
//        StreamMessage<HttpData> publisher = StreamMessage.of(httpData);
//
//        return StreamMessages.writeTo(publisher, destination, options);
//    }
//}