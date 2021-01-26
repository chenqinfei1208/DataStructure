import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Interface {



            /** 

              * 题目描述 请实现接口： unsigned int AddCandidate (char* pCandidateName); 功能：设置候选人姓名 输入： 

              * char* pCandidateName 候选人姓名 输出：无 返回：输入值非法返回0，已经添加过返回0 ，添加成功返回1 

              *  

              * Void Vote(char* pCandidateName); 功能：投票 输入： char* pCandidateName 候选人姓名 输出：无 

              * 返回：无 

              *  

              * unsigned int GetVoteResult (char* pCandidateName); 

              * 功能：获取候选人的票数。如果传入为空指针，返回无效的票数，同时说明本次投票活动结束，释放资源 输入： char* pCandidateName 

              * 候选人姓名。当输入一个空指针时，返回无效的票数 输出：无 返回：该候选人获取的票数 

              *  

              * void Clear() // 功能：清除投票结果，释放所有资源 // 输入： // 输出：无 // 返回 

              *  

              * 输入描述: 输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。 输出描述: 每行输出候选人的名字和得票数量。 示例1 输入 

              *  

              * 4 A B C D 8 A B C D E F G H 输出 

              *  

              * A : 1 B : 1 C : 1 D : 1 

              *  

              */

  static List<String> candiList = new ArrayList<>();  

                static List<Integer> votess = new ArrayList<>();  

              

                public static void main(String[] args) {  

        Scanner scanner = new Scanner(System.in);  

        while (scanner.hasNext()) {  

            int addResult = 0;  

            String candidateNum1 = scanner.nextLine();  

            String candidate = scanner.nextLine();  

            String voteNum1 = scanner.nextLine();  

            String vote = scanner.nextLine();  

            String[] candidates = candidate.split(" ");  

            String[] votes = vote.split(" ");  

            int candidateNum = Integer.parseInt(candidateNum1);  

            int voteNum = Integer.parseInt(voteNum1);  

  

            for (int i = 0; i < candidates.length; i++) {  

                addResult = AddCandidate(candidates[i]);  

            }  

            candiList.add("Invalid");  

            votess.add(0);  

  

            for (int i = 0; i < votes.length; i++) {  

  

                Vote(votes[i]);  

            }  

            int numbs = 0;  

            for (int i = 0; i < candidateNum; i++) {  

                String c = candiList.get(i);  

                numbs = GetVoteResult(c);  

                System.out.println(c + " : " + numbs);  

            }  

            System.out.println("Invalid" + " : " + votess.get(candiList.indexOf("Invalid")));  

            Clear();  

        }  

  

    }  

              

                // 设置候选人姓名  

                public static int AddCandidate(String pCandidateName) {  

        if (pCandidateName == " ") {  

            return 0;  

        }  

  

        if (!candiList.contains(pCandidateName)) {  

            candiList.add(pCandidateName);  

            votess.add(0);  

            return 1;  

        } else {  

            return 0;  

        }  

  

    }  

              

                // 功能：投票  

                public static void Vote(String pCandidateName) {  

        int index = 0;  

        if (candiList.contains(pCandidateName)) {  

            index = candiList.indexOf(pCandidateName);  

            votess.set(index, votess.get(index) + 1);  

        } else {  

            index = candiList.indexOf("Invalid");  

            votess.set(index, votess.get(index) + 1);  

        }  

    }  

              

                // 功能：获取候选人的票数。  

                public static int GetVoteResult(String pCandidateName) {  

        int index = candiList.indexOf(pCandidateName);  

  

        return votess.get(index);  

  

    }  

              

                // 功能：清除投票结果，释放所有资源  

            public static void Clear() {  

           candiList.clear();  

           votess.clear();  

   }
}
