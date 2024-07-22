/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  EndView.java
 * DESC  : 재능 기부 정보 출력 클래스
 * 
 * @author  
 * @version 1.0
*/

package probono.view;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import probono.model.dto.TalentDonationProject;

public class EndView {
	
	//진행중인 특정 프로젝트 출력 
	public static void projectView(TalentDonationProject project){
		Optional<TalentDonationProject> pr = Optional.ofNullable(project);
		pr.ifPresentOrElse(
				pro -> System.out.println(pro),
				()-> System.out.println("해당 프로젝트가 존재하지 않습니다.(수정)")
		);
	}
	
	//진행중인 모든 프로젝트 출력
	public static void projectListView(ArrayList<TalentDonationProject> allProbonoProject){
		AtomicInteger index = new AtomicInteger(1);
		
		allProbonoProject.stream().forEach(v -> {
			System.out.println("[진행 중인 project : " + (index.getAndIncrement()) + " ] " + v);
		});
	}
		
	public static void successMessage(String message) {
		System.out.println(message);
	}
	
}






