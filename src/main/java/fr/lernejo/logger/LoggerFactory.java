package fr.lernejo.logger

	public class LoggerFactory {
		static public getLogger(String name){
		Logger elm = new ConsoleLogger();
		return elm;
		}
	}
