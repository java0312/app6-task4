package uz.pdp.app6task4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import uz.pdp.app6task4.entity.User;

import java.util.List;
import java.util.UUID;

@Repository
@Transactional(readOnly = true) //faqat o'qish metodlar ishlaydi
public interface UserRepository extends JpaRepository<User, UUID> {

    @Override
    @Transactional(timeout = 10) // metod 10 soniyalik tanaffus bilan ishlaydi
    List<User> findAll();


}
