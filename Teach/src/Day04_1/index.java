package Day04_1;

/**
 * 
 * @author Axoford12
 * @since 2016.6.19 这里我们直接Main方法来演示了 我们可以看到先执行了主方法，后面再执行的线程，明显不对是吧。，这是单线程！
 */
public class index {
		//呢，會等待CPU分配時間片
		// 分到了時間片，線程執行。 時間片的
	public static void main(String[] args) {
		Runnable my = new RunnableThreadStudy();
		// 刚刚Eclipse发什么神经。。
		// 我们看到了分配是完全不规律的，CPU的算法我们也不知道。
		// 测试github
		Thread t = new Thread(my);
		// 这里为什么，没有Start呢，因为，我们实现的是接口，接口里面没有提供
		// Start 方法。
		// 为什么会报错知道吗？
		// QQ告诉我
		// 翻了翻API  我们发现Runnable 是  Thread的接口
		t.start();// 然而還是不對，，呃呃
		// 看看我们为什么. 不出来Start
		// 原因是什麼呢？剛剛控制台實在是太醜了。。
		// 原因是，方法在執行過程中，會等待CPU的資源。等CPU分時間片給他
		// 我們可以讓Main方法等一下線程是吧
		// 線程Start以後，會進入就緒狀態，然後分配是CPU的事情，我們沒辦法操控
		// 後面我們會學習如何建議CPU先給誰分配時間片。
		// 好了，今天本節課內容就這樣。
		for (int i = 0; i < 10; i++) {
			System.out.println("我是主方法线程");
			try {
				Thread.sleep(1000);//我知道了。Ctrl + Shift + F 是Eclipse 的
				// 排版快捷键。但是也是这个输入法的快捷键。。。
				// 看懂了QQ发我一个Ok!
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// my.run();//这样调用方法对不对呢？
		// 把它注釋掉
	}
}
