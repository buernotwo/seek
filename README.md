# seek

Seek you wherever U‘re

持续更新中...
-------------
#1、数据从哪来，到哪去？

	1>数据可以采取启发式，用户输入的数据会自动被分词加入到数据库中，
	数据库根据这些分词的重要程度进行排序，依次抓取网络数据，
	再将抓取到的数据加载到数据库中重新排序，再次生成排序后的结果，再次抓取数据。
	并将数据以文件或者文本形式加载到数据库中。用户下次再搜索相同的数据，就不会返回数据库异常了。

	2>当用户A搜索的名字正好是用户B，同时用户B也在搜索用户A，那么A可看到B的信息，
	B也可看到A的信息。称之为信息的交换。
	
	3>为保证信息传递的可观性，将两点（IP）之间进行连线。
	
	4>数据的传递不局限于文本，可以语音，视频，等等。当然是否语音视频需要双方协商OK才可进行，
	保护好个人隐私。
	
#2、待补充。