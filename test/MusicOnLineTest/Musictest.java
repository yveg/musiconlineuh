/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicOnLineTest;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class Musictest {
    
    @Test
    public void Musictest() {
        EntityManager em = Persistence.createEntityManagerFactory("MusiconlinePU").createEntityManager();
    }
    
}
