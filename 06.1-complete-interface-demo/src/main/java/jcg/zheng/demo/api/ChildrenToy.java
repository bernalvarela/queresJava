package jcg.zheng.demo.api;

public interface ChildrenToy {
    /**
     * Play the demo song
     * 
     * @return the demo song
     */
    default String demo() {
	return "Play the demo song";
    }

}
