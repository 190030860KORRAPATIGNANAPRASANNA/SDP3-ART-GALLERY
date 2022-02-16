package com.klef.demo;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    private RoleRepository roleRepo;
	
	@Test
	public void testCreateUser()
	{
		User user = new User();
	    user.setEmail("chagantijeevitha@gamil.com");
	    user.setPassword("Sweety@12345");
	    user.setFirstName("Chaganti");
	    user.setLastName("Jeevitha");
	    User savedUser = userRepo.save(user);
	     
	    User existUser = entityManager.find(User.class, savedUser.getId());
	     
	    assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
	}
	
	@Test
	public void testFindUserByEmail()
	{
		String email="chagantijeevitha@gamil.com";
		User user=userRepo.findByEmail(email);
		assertThat(user).isNotNull();
	}
	
	@Test
	public void testAddRoleToNewUser() {
	User user = new User();
	    user.setEmail("prasanna@gmail.com");
	    user.setPassword("prasanna");
	user.setFirstName("prasanna");
	user.setLastName("korrapati");
	
	Role roleUser = roleRepo.findByName("User");
	user.addRole(roleUser);
    User savedUser = userRepo.save(user);
    assertThat(savedUser.getRoles().size()).isEqualTo(1);

	}
}

