package repositroies;

import model.Writer;

import java.util.List;

public class GsonWriterRepository extends WriterRepository{
    @Override
    public Writer getById(Integer integer) {
        return null;
    }

    @Override
    public List<Writer> getAll() {
        return List.of();
    }

    @Override
    public Writer save(Writer writer) {
        return null;
    }

    @Override
    public Writer update(Writer writer) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
