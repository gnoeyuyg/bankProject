package kr.ac.kopo.savings.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.ac.kopo.savings.vo.SavingsAccountVO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SavingsAccountDAOImpl implements SavingsAccountDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<SavingsAccountVO> findAllSavingsAccounts() throws Exception {
        return sqlSession.selectList("kr.ac.kopo.savings.dao.SavingsAccountDAO.findAllSavingsAccounts");
    }

    @Override
    public void savingsAccountRegister(SavingsAccountVO savingsAccount) throws Exception {
        sqlSession.insert("kr.ac.kopo.savings.dao.SavingsAccountDAO.savingsAccountRegister", savingsAccount);
    }

    @Override
    public void savingsDeposit(String savingsAccountNum, int amount) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("savings_account_num", savingsAccountNum);
        params.put("amount", amount);
        sqlSession.update("kr.ac.kopo.savings.dao.SavingsAccountDAO.savingsDeposit", params);
    }

    @Override
    public void createSavings(SavingsAccountVO account) throws Exception {
        sqlSession.insert("kr.ac.kopo.savings.dao.SavingsAccountDAO.createSavings", account);
    }

    @Override
    public SavingsAccountVO readSavings(String savingsAccountNum) throws Exception {
        return sqlSession.selectOne("kr.ac.kopo.savings.dao.SavingsAccountDAO.findSavingsAccountByNumber", savingsAccountNum);
    }

    @Override
    public void updateSavingsAccount(SavingsAccountVO account) throws Exception {
        sqlSession.update("kr.ac.kopo.savings.dao.SavingsAccountDAO.updateSavingsAccount", account);
    }

    @Override
    public void deleteSavings(String depositType) throws Exception {
        sqlSession.delete("kr.ac.kopo.savings.dao.SavingsAccountDAO.deleteSavings", depositType);
    }

    @Override
    public void applyInterest(SavingsAccountVO account) throws Exception {
        double dailyInterestRate = account.getInterest_rate() / 365;
        double newBalance = account.getAmount() * (1 + dailyInterestRate);
        account.setAmount(newBalance);
        sqlSession.update("kr.ac.kopo.savings.dao.SavingsAccountDAO.updateSavingsAccount", account);
    }

    @Override
    public SavingsAccountVO findSavingsAccountByNumber(String savingsAccountNum) throws Exception {
        return sqlSession.selectOne("kr.ac.kopo.savings.dao.SavingsAccountDAO.findSavingsAccountByNumber", savingsAccountNum);
    }

    @Override
    public int getProductNumber(String depositType) throws Exception {
        return sqlSession.selectOne("kr.ac.kopo.savings.dao.SavingsAccountDAO.getProductNumber", depositType);
    }

    @Override
    public boolean isAccountNumberExists(String accountNumber) throws Exception {
        int count = sqlSession.selectOne("kr.ac.kopo.savings.dao.SavingsAccountDAO.isAccountNumberExists", accountNumber);
        return count > 0;
    }

    @Override
    public List<String> getAllDepositTypes() throws Exception {
        return sqlSession.selectList("kr.ac.kopo.savings.dao.SavingsAccountDAO.getAllDepositTypes");
    }
    
    @Override
    public void updateAllSavingsAccounts() throws Exception {
        sqlSession.update("kr.ac.kopo.savings.dao.SavingsAccountDAO.updateAllSavingsAccounts");
    }



}
