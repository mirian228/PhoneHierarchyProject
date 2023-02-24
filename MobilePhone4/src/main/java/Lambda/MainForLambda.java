package Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.DoubleConsumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import interfaces.ICall;

public class MainForLambda {

	public final static Logger LOGGER = LogManager.getLogger(MainForLambda.class);

	public static void main(String[] args) {
		int phoneNumber[] = new int[10];

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "D");
		map.put(2, "E");
		map.put(3, "F");

		IPrint printer = (s) -> LOGGER.info(s + "text");
		printer.print("Test: ");

		ICall call = (n, p) -> {
			LOGGER.info("Calling " + n);
		};

		call.call("Mirian", phoneNumber);

		ICombine<Integer, Integer> iCombine = (a, b) -> a + b;
		LOGGER.info("Result: " + iCombine.combine(5, 10));

		BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a + b) < 100;
		LOGGER.info(biPredicate.test(10, 20));

		BiFunction<Integer, Integer, Integer> BiFunction = (a, b) -> a + b;
		LOGGER.info(BiFunction.apply(20, 40));

		BiConsumer<Integer, String> biConsumer = (k, v) -> LOGGER.info("Key: " + k + "\t" + "Value: " + v);
		map.forEach(biConsumer);

		DoubleConsumer doubleConsumer = (v) -> LOGGER.info(v);
		doubleConsumer.accept(5.55);

		// OR
		map.forEach((k, v) -> LOGGER.info("Key: " + k + "\t" + "Value: " + v));

	}

}
