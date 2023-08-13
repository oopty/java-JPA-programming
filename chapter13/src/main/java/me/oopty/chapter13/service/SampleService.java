package me.oopty.chapter13.service;

import me.oopty.chapter13.domain.Sample;
import me.oopty.chapter13.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SampleService {
    @Autowired
    private SampleRepository sampleRepository;

    public Sample findOne(Long sampleId) {
        return sampleRepository.findOne(sampleId);
    }

    public Sample create(Sample sample) {
        return sampleRepository.save(sample);
    }

    public Sample update(Sample sample) {
        return sampleRepository.save(sample);
    }

    public Sample delete(Long sampleId) {
        Sample finded = sampleRepository.findOne(sampleId);
        sampleRepository.delete(sampleId);
        return finded;
    }
}
