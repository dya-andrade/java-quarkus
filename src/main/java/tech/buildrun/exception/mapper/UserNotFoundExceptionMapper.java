package tech.buildrun.exception.mapper;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import tech.buildrun.exception.UserNotFoundException;

@Provider
public class UserNotFoundExceptionMapper implements ExceptionMapper<UserNotFoundException> {

    @Override
    public Response toResponse(UserNotFoundException userNotFoundException) {
        return Response.status(Response.Status.NOT_FOUND.getStatusCode(), "User not found!").build();
    }
}
