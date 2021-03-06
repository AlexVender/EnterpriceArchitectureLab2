package lab.dao;

import lab.dao.exceptions.DAOException;
import lab.dao.interfaces.ProjectsDAO;
import lab.entities.ProjectEntity;
import lab.utils.HibernateSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProjectsDAOImpl extends AbstractDAO implements ProjectsDAO {
    
    @Autowired
    public ProjectsDAOImpl(HibernateSessionFactory hibernateSessionFactory) {
        super(hibernateSessionFactory);
    }
    
    @Override
    public Integer create(ProjectEntity project) throws DAOException {
        return super.create(project);
    }

    @Override
    public ProjectEntity read(Integer id) throws DAOException {
        return (ProjectEntity) read(id, ProjectEntity.class);
    }

    @Override
    public List<ProjectEntity> readAll(Integer limit, Integer offset) throws DAOException {
        return readAll(limit, offset, ProjectEntity.class);
    }

    @Override
    public void update(ProjectEntity project) throws DAOException {
        super.update(project);
    }

    @Override
    public void delete(ProjectEntity projectEntity) throws DAOException {
        super.delete(projectEntity);
    }
}
