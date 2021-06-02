package com.example.debtcontr;


import javax.inject.Singleton;

import dagger.Component;

@Component(modules = { AppModule.class})
@Singleton

public interface AppComponent {

    //void inject(AddAgentActivity addAgentActivity);
    void injectAgen(AgentModel agentModel);
    void injectAdd(AddAgentActivity addAgentActivity);
    //Context inject(AgentModel agentModel);
}
