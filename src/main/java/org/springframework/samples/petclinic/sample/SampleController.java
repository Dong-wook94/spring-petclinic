package org.springframework.samples.petclinic.sample;

public class SampleController {

    SampleRepository sampleRepository;


    //생성자가 한개뿐
    public SampleController(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public void doSomething(){
        sampleRepository.save();
    }
}
