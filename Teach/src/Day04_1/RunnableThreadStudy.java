package Day04_1;

/**
 * 
 * @author Axoford12
 * @since 2016.6.19
 * 刚才呢我们学习了继承Thread 方法，现在来学习实现Runnable 接口
 * 为什么会有报错呢，因为你没实现啊！
 * 把鼠标放到报错这里然后按  Ctrl + 1  我们看到了Run..是吧，就在这里
 * 写就写了
 *
 */
public class RunnableThreadStudy implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("我是Runnable线程");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
