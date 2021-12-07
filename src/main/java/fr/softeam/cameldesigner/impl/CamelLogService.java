package fr.softeam.cameldesigner.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.context.log.ILogService;

/**
 * Proxy for the Modelio {@link ILogService}, configuring the ModelingWizardMdac.
 */
@objid ("7dd10dcb-fb7e-4171-80f7-033a28d009ca")
public class CamelLogService {
    @objid ("161cc86f-9163-4ddd-bc80-f6258af0eaf7")
    private ILogService logService;

    /**
     * Default constructor.
     * 
     * @param logService the Modelio log service.
     * @param module the current instance of {@link CamelDesignerModule}.
     */
    @objid ("6e8a26d2-410f-446c-a962-2e1470c45bb0")
    public CamelLogService(ILogService logService, CamelDesignerModule module) {
        this.logService = logService;
    }

    /**
     * Output an information message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * 
     * @param msg a message to be displayed as a log.
     */
    @objid ("a05587b9-87bd-42de-9d6b-e60668597014")
    public void info(final String msg) {
        this.logService.warning(msg);
    }

    /**
     * Output a warning message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * 
     * @param msg a message to be displayed as a log.
     */
    @objid ("13a9df07-4e69-4afc-9688-76ee32460e0e")
    public void warning(final String msg) {
        this.logService.warning(msg);
    }

    /**
     * Output an error message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * 
     * @param msg a message to be displayed as a log.
     */
    @objid ("d03afa5c-2648-40fc-844e-d8484bada39e")
    public void error(final String msg) {
        this.logService.error(msg);
    }

    /**
     * Log the given exception with its stack trace as an information.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param t an exception to be displayed as a log.
     */
    @objid ("3e71dffc-769e-4302-9b27-98ce9d7e6394")
    public void info(final Throwable e) {
        this.logService.info( e);
    }

    /**
     * Log the given exception with its stack trace as a warning.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param t an exception to be displayed as a log.
     */
    @objid ("98948513-d8dc-4d38-aee1-cbdd11233508")
    public void warning(final Throwable e) {
        this.logService.warning(e);
    }

    /**
     * Log the given exception with its stack trace as an error.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param t an exception to be displayed as a log.
     */
    @objid ("9641621a-6e87-4c04-a681-a16df00db81f")
    public void error(final Throwable e) {
        this.logService.error(e);
    }

}
