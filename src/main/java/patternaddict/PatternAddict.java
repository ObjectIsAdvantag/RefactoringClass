package patternaddict;

interface MessageStrategy {
	void sendMessage();
}

abstract class AbstractStrategyFactory {
	public abstract MessageStrategy createStrategy(MessageBody mb);
}

class MessageBody {
	Object payload;
	public Object getPayLoad() {
		return payload;
	}
	public void configure(Object obj) {
		payload = obj;
	}
	public void send(MessageStrategy ms) {
		ms.sendMessage();
	}
}

class DefaultFactory extends AbstractStrategyFactory {

	public MessageStrategy createStrategy(final MessageBody mb) {
		return new MessageStrategy() {

			MessageBody body = mb;

			public void sendMessage() {
				Object obj = body.getPayLoad();
				System.out.println(obj);
			}
		};
	}

	static DefaultFactory instance;
	public static AbstractStrategyFactory getInstance() {
		if (instance == null) {
			instance = new DefaultFactory();
		}
		return instance;
	}

}

public class PatternAddict {

	public static void main(String[] args) {
		MessageBody mb = new MessageBody();
		mb.configure("Guess what, I am a pattern addict !");
		AbstractStrategyFactory asf = DefaultFactory.getInstance();
		MessageStrategy strategy = asf.createStrategy(mb);
		mb.send(strategy);
	}
}
