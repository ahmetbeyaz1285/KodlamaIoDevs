package kodlamaIo.devs.businnes.requests.programminglanguagerequests;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProgrammingLanguageRequest {
	
	private int id;
	
	private String name;

}
