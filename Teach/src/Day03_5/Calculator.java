package Day03_5;

public class Calculator {
	// 额计算器是不是这么拼的我忘了。。
	public double chufa(int i,int j) throws Exception{
		if(j==0){
			Exception e = new NumberException("/  by zero  -MyException");
			// 这个必须遵守，模仿也要"版权所有"!
//			throw e;
			Exception e1 = new ComputeException("计算错误");
			e1.initCause(e);//这句话就表明了e1是由e造成的。
			// 好了，这个e1这个异常呢只是一个很宽泛的概念，代表计算错误，，那么我们要给出提示
			throw e1;//这里抛出一个就行了，抛出大的原因，会有小的，细致的原因自己抛出
			
			// 额刚刚看那个批处理就是host的自动更新程序。你看我都没点就自己开了是吧。
			// 也就是说为什么会有计算错误，原因是以0做除数。
			// 好了 我们看到了Caused by 就是异常链。
		}
		return i/j;
	}

}
