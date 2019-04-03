package ru.mtuci.labwork1;

import org.junit.Assert;
import org.junit.Test;
import ru.mtuci.labwork1.model.Group;
import ru.mtuci.labwork1.repository.GroupsRepository;

public class TestGroupsRepository {

    GroupsRepository repository = new GroupsRepository();

    @Test
    public void testCreate() throws Exception {

        Group group1 = new Group(null, "2MIB1801");
        Group created = repository.save(group1);
        group1.setId(created.getId());
        Assert.assertEquals(group1,created);
    }
}
