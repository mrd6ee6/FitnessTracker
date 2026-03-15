package pl.wsb.fitnesstracker.healthmetrics.api;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "HealthMetrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class HealthMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @Column(name = "user_id", nullable = false)
    private String user_id;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "weight", nullable = false)
    private LocalDate weight;

    @Column(name = "height", nullable = false)
    private LocalDate height;

    @Column(name = "heartRate", nullable = false)
    private LocalDate heartRate;

}

